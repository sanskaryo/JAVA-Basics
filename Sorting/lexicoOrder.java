public class lexicoOrder {

    static void sortWords(String[ ] words) {
        int n = words.length;

        for(int i = 0; i <n-1; i++) {
            int min_index = i;
            for(int j=1+1;j<n; j++) {
                if(words[j].compareTo(words[min_index])<0) {
                    min_index = j;  
                }
            }
        }
    } 




    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "programming"};
        sortWords(words);
        for(String val : words){
            System.out.println(val);
        }
    }
    
}
