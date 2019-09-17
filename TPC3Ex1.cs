

private static bool Foo(String msg){

    if(msg.getLength()==1){
        return 1;
    }
    if(msg.getChars(0) != msg.getChars(msg.getLength()-1)){
        return 0;
    }
    if(msg.getLength() == 2){
        return 1;
    }
    return Foo(msg.subString(1,msg.getLength()-2)))
    
}