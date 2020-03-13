package org.employee.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements FactoryBean<Date>
{
    private  String date;

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception
    {
        String d[] = date.split("\\|");
        String format = d[1].trim();
        String date = d[0].trim();
        return new SimpleDateFormat(format).parse(date);
    }

    @Override
    public Class<Date> getObjectType()
    {
        return java.util.Date.class;
    }
}
