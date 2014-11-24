function loadTableAjax(path, e_id, funcFill, begin, countSize) {
    var json = {
        firstResult: begin,
        selectCount: countSize
    };

    $.ajax({
        url: path,
        data: JSON.stringify(json),
        type: "POST",
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },
        success: function (e_obj) {
            funcFill(e_id, e_obj);
        },
        error: function () {
            alert('failure');
        }
    });
}

function loadSizeList(path, e_id, funcSize){
    $.ajax({
        url: path,
        type: "POST",
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Accept", "application/json");
            xhr.setRequestHeader("Content-Type", "application/json");
        },
        success: function (size) {
            $(e_id).html("");
            $(e_id).append("<p>"+size+"<p>")
        },
        error: function () {
            alert('failure');
        }
    });
}