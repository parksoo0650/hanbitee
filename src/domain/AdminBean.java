package domain;

import lombok.*;

@Data
public class AdminBean{
    @Setter @Getter
    private String admID, admPass, admName, admGen ,admPhone, admEmail,permission;

  
}
