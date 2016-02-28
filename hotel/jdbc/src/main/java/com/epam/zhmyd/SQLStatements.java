package com.epam.zhmyd;

public final class SQLStatements {
    public static final String TABLE_USER = "CREATE TABLE `users` (\n" +
            " `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
            " `name` VARCHAR(45) NOT NULL,\n" +
            " `surname` VARCHAR(45) NOT NULL,\n" +
            " `birthdate` DATE NOT NULL,\n" +
            " PRIMARY KEY (`id`),\n" +
            " UNIQUE KEY `id_UNIQUE` (`id`))\n" +
            "  ENGINE = InnoDB DEFAULT CHARSET = utf8";
}
