package com.example.demo.em;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Title: JobConverter <br>
 * Description: JobConverter <br>
 * Date: 2018年07月19日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 *
 * autoApply = true
 */
@Converter(autoApply = true)
public class JobConverter implements AttributeConverter<JobEm,String> {

    public String convertToDatabaseColumn(JobEm attribute) {

        return attribute.getCode();
    }
    public JobEm convertToEntityAttribute(String dbData) {

        for(JobEm jobEm : JobEm.values()){
            if(jobEm.getCode()==dbData){
                return jobEm;
            }
        }
        return null;
    }
}
