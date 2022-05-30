package com.example.retrofit;

/**
*响应数据类
* */
public class Result{
    String code;
    Data data;
    class Data{
        boolean verifySuccess;
        UserInfo userInfo;

        @Override
        public String toString() {
            return "Data{" +
                    "verifySuccess=" + verifySuccess +
                    ", userInfo=" + userInfo +
                    '}';
        }

        class UserInfo{
            String username;
            String email;
            String address;

            @Override
            public String toString() {
                return "UserInfo{" +
                        "username='" + username + '\'' +
                        ", email='" + email + '\'' +
                        ", address='" + address + '\'' +
                        '}';
            }
        }

    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
