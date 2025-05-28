package com.example.java_ifortex_test_task.convertet;

import com.example.java_ifortex_test_task.entity.DeviceType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DeviceTypeConverter implements AttributeConverter<DeviceType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DeviceType attribute) {
        return attribute == null
                ? null
                : attribute.getCode();
    }

    @Override
    public DeviceType convertToEntityAttribute(Integer dbData) {
        return dbData == null
                ? null
                : DeviceType.fromCode(dbData);
    }
}