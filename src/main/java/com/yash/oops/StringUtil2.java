package com.yash.oops;

public class StringUtil2 {
    public static String getCommand(String url) {

        String[] urlParts = url.split("/");
        String commandWithExtension = urlParts[urlParts.length - 1];
        String command = commandWithExtension.substring(0,commandWithExtension.lastIndexOf("."));

        return command;
    }
    public static void main(String[] args) {
        StringUtil obj=new StringUtil();
        String[] testUrls = {
                "http://example.com/user/updateProfile.html",
                "https://test.com/project/deleteProject.jsp",
                "localhost:8080/admin/createUser.php"
        };

        for (String url : testUrls) {
            System.out.println("URL: " + url);
            System.out.println("Command: " + StringUtil2.getCommand(url));
            System.out.println();
        }
    }
    }

