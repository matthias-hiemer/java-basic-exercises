package model;

public class BiologyStudent extends Student{

    protected String favoriteAnimal;

    public BiologyStudent(int id, String name) {
        super(id, name);
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "favoriteAnimal='" + favoriteAnimal + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
