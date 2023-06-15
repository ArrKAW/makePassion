package com.project.littlebank.user.signup.jpa.converter;


import com.project.littlebank.user.signup.jpa.Utils.Aes256Utils;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.thymeleaf.util.StringUtils;

@Converter
public class Aes256Converter implements AttributeConverter<String, String> {

    private final Aes256Utils aes256Utils;

    public Aes256Converter() {
        this.aes256Utils = new Aes256Utils();
    }

    @Override
    public String convertToDatabaseColumn(String attribute) {
        if (StringUtils.isEmpty(attribute)) {
            return attribute;
        }
        try {
            return aes256Utils.encrypt(attribute);
        } catch (Exception e) {
            throw new RuntimeException("failed to encrypt data", e);
        }
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        try {
            return aes256Utils.decrypt(dbData);
        } catch (Exception e) {
            return dbData;
        }
    }

}
