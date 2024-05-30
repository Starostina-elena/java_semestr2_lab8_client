package org.lia.commands;


import org.lia.models.Product;

import java.io.Serializable;

public class RemoveHeadCommand implements Command {
    public Product product;
    private static final long serialVersionUID = 1785464768755190753L;
    private String login;
    private String password;


    public String description() {
        return "shows first element of collection and deletes it";
    }

    public void execute(String[] arguments, String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
