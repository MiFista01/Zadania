package zadania;

public class alphabeth {
    public static void main(String[] args) {
        String sentens = "jackdaws love my big sphinx of quartz";
        //создания массива в котором каждый элемент это буква алфавита
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //создания массива в котором каждый элемент это буква алфавита

        //проверка на то что в фразе существуют все  буквы алфавита
        if (sentens.length()>=alphabet.length){
            int counter = 0;
            for (int i=0; i<alphabet.length;i++){
                for (int j=0; j<sentens.length();j++){
                    if (alphabet[i]==sentens.charAt(j)){
                        counter++;
                        break;
                    }
                }
            }
            if (counter==alphabet.length){
                System.out.println("Your sentens is true");
            }else{
                System.out.println("Your sentens is false");
            }
        }else{
            System.out.println("This sentens shorter than necessary");
        }
        
        //проверка на то что в фразе существуют все  буквы алфавита
    }
}
