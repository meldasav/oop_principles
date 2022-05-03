package abstraction.abstract_classes;

import abstraction.interfaces.ClassB;
import abstraction.interfaces.ClassC;

public interface BlueTooth  {
    void connectBlueTooth();
//static method
    static int getYear(){
        return 2022;
    }

    //Default method (non-static method )
     default boolean isConnected(){
        return true;
    }


    }

