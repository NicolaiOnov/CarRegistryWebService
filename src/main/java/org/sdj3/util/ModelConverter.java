package org.sdj3.util;

import org.sdj3.model.CarPart;
import org.sdj3.remote.CarPartDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ModelConverter {

    public static CarPart convert(CarPartDTO carPartDTO){
        return new CarPart(
                carPartDTO.getWeight(),
                carPartDTO.getChassisNo(),
                carPartDTO.getModel(),
                carPartDTO.getType()
                );
    }

    public static Collection<CarPart> convert(Collection<CarPartDTO> carPartDTOCollection){
        Collection<CarPart> carPartCollection = new ArrayList<CarPart>();
        for(CarPartDTO carPartDTO : carPartDTOCollection){
            carPartCollection.add(convert(carPartDTO));
        }
        return carPartCollection;
    }
}
