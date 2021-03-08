package test;

import javax.swing.*;

public class test2 {


    public static String passWord(String id, String pw1, String pw2)
    {

        String pwRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$])[A-Za-z\\d!@#$]{8,20}$";
        String idRegex = "[a-z0-9]{3,20}$";
        if(pw1.matches(pwRegex) && pw2.matches(pwRegex) && pw1.equals(pw2) && id.matches(idRegex))
        {
            return "pass";
        }
        else
        {
           return "fail";
        }
    }

    public static void main(String[] args) {
        System.out.println(passWord("audgpdus","1234", "1234"));
        System.out.println(passWord("audgpdus","1234qwe!", "1234qwe!"));

    }
}
