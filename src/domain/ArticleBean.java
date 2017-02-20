package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ArticleBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Setter @Getter
    private String seq,id,title,content,regdate,readCount;

   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("[ %s | %s | %s | %s | %s ]", seq,id,title,regdate,"0");
    }
}
