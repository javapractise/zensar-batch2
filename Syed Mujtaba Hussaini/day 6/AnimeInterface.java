interface Anime{
    void topAnime();
    void topChar();
    final String top = "Naruto";
}

class Naruto implements Anime{
    
    int rating;
    String name;
    
    Naruto(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    
    public void topAnime(){
        System.out.println("The name of the top anime is " + name);
        System.out.println("The highest rating they got is " + rating);
    }
    
    public void topChar(){
        System.out.println("The top rated character is " + top);
    }
}

class Main{
    public static void main(String[] args){
            
        Naruto n = new Naruto("Demon Slayer", 9);
        n.topAnime();
        n.topChar();

    }
}