package app.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BaseVO {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDateTime = new Date();

    public Date getCreatedDateTime() {
        return createdDateTime;
    }
}
