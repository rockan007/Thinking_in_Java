//finalize 已被废弃
package chapter_5;

public class Book {
    boolean checkedOut=false;
    Book(boolean checkOut){
        checkedOut=checkOut;
    }
    void checkIn(){
        checkedOut=true;
    }
    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error:checked out");
           super.finalize();
        }
    }
}

