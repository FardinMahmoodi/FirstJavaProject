import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void test(){

    }
    class Mashin{
        boolean ayaMashinRoshanAst;
        boolean ayaDarBasteAst;

        double tool;
        double arz;

        void roshan(){
            ayaMashinRoshanAst = true;
            System.out.println("mashin Roshane");
        }

        void bazKardanDar(){
            ayaDarBasteAst = false;
        }
        void bastanDar(){
            ayaDarBasteAst = true;
        }
        void haraKat(){
            if (!ayaDarBasteAst && ayaMashinRoshanAst){
                System.out.println("GO");
            }else{
                System.out.println("this is not possible");
            }
        }

    }
}
