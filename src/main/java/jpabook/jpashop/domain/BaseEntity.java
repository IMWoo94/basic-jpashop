package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    private String regBy;
    private String modBy;
    private LocalDateTime regDate;
    private LocalDateTime modDate;

    public LocalDateTime getModDate() {
        return modDate;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public String getModBy() {
        return modBy;
    }

    public String getRegBy() {
        return regBy;
    }

    public void setModBy(String modBy) {
        this.modBy = modBy;
    }

    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }

    public void setRegBy(String regBy) {
        this.regBy = regBy;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
}
