package io;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * zhiliu
 */
public class LogInfo {
    private Date date;
    private String msg;
    private Object obj;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ahh:mm:ss");
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        msg = msg.replace(",", "，");
        this.msg = msg;
    }
    public Object getObj() {
        return obj;
    }
    public void setObj(Object obj) {
        if(obj == null) this.obj = ""; else this.obj = obj;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((msg == null) ? 0 : msg.hashCode());
        result = prime * result + ((obj == null) ? 0 : obj.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogInfo other = (LogInfo) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (msg == null) {
            if (other.msg != null)
                return false;
        } else if (!msg.equals(other.msg))
            return false;
        if (this.obj == null) {
            if (other.obj != null)
                return false;
        } else if (!this.obj.equals(other.obj))
            return false;
        return true;
    }
    public LogInfo(String msg, Object obj) {
        super();
        date = new Date();
        setMsg(msg);
        setObj(obj);
    }
    public LogInfo(String msg) {
        this(msg,null);
    }
    @Override
    public String toString() {
//		日期,msg,obj.toString()
        String str = sdf.format(date)+","+msg+","+obj.toString();
        return str;
    }

}

