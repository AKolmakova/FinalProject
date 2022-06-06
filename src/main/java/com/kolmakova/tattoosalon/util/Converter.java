package com.kolmakova.tattoosalon.util;


import com.kolmakova.tattoosalon.entity.Entity;
import com.kolmakova.tattoosalon.response.dto.EntityDTO;

import java.util.List;

public interface Converter<T extends Entity, R extends EntityDTO> {

    List<R> convertToDTOList(List<T> list);

    R convertToDTO(T component);


}
