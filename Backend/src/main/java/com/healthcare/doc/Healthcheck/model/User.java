package com.healthcare.doc.Healthcheck.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
    @Getter
    @Setter

    public class User {
        @Id
        private String id;
    @Indexed(unique = true)
        private String username;
        private String password;
        private String email;
        private String role;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {

            this.email = email;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    public String getId() {
        return id;
    }

    public void setId(String id) {

            this.id = id;
    }
    }

