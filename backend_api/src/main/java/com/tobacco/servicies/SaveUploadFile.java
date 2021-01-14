package com.tobacco.servicies;

import org.springframework.stereotype.Service;

@Service
public class SaveUploadFile {

    public String saveUploadFile(byte[] multipartImage){
        //Мок метода загрузки
        String url = "https://yandex.ru/images/search?text=kenny%20little%20pictures&pos=3&img_url=https%3A%2F%2Fsun9-4.userapi.com%2FkwSXOeYv3EeMxC7BMYISl1IW4Cc_G2I7rtSMEw%2FjuvRMKWeUwY.jpg&rpt=simage";

        return url;
    }

}
