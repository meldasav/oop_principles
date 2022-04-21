package abstraction.abstract_classes;

public interface BlueTooth {
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

