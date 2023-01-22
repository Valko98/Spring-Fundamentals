package com.softuni.mobilele.models.dtos;
import java.util.Date;

public class BrandDto extends BaseEntityDto {

        private String name;

        private Date created;

        private Date modified;

        public BrandDto() {

        }

        public String getName() {
            return name;
        }

        public Date getCreated() {
            return created;
        }

        public Date getModified() {
            return modified;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCreated(Date created) {
            this.created = created;
        }

        public void setModified(Date modified) {
            this.modified = modified;
        }
    }

