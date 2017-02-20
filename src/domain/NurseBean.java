package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class NurseBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Setter @Getter
    private String nurId, nurPass,majorJob, nurName, nurGen, nurPhone, nurEmail, nurPosition;
}
