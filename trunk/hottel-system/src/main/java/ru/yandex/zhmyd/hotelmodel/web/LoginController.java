package ru.yandex.zhmyd.hotelmodel.web;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ru.yandex.zhmyd.hotelmodel.domain.Room;
import ru.yandex.zhmyd.hotelmodel.service.SearchRoomService;

@Controller
@RequestMapping("")
public class LoginController {

	@Autowired
	private SearchRoomService searchRoomService;

	@RequestMapping(value = { "", "/", "/login" }, method = { RequestMethod.GET })
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView login(
			@RequestParam(value = "username", required = true) int minPrice,
			@RequestParam(value = "password", required = true) int maxPrice,
			HttpServletRequest request, HttpSession session) {

		ModelAndView mav = new ModelAndView();

		List<Room> user = searchRoomService.getByPrice(minPrice, maxPrice);
		mav.addObject("error", "Invalid username or password!");
		mav.setViewName("login");

		return mav;
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpSession session) {

		ModelAndView model = new ModelAndView();
		model.setViewName("login");

		session.setAttribute("user", null);
		session.invalidate();

		return model;
	}

}