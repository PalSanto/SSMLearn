package com.example.ssmlearn_web.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String strDate) {
        //将日期字符串转为日期对象（Date类）
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = format.parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }
}
