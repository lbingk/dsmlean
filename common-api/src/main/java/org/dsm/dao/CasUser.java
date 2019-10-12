package org.dsm.dao;

import lombok.*;

import java.io.Serializable;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CasUser implements Serializable {
    private Long id;
    private String username;
    private String password;

    public static class Student {
        private Long id;

        private String name;

        private Integer age;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name == null ? null : name.trim();
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}

