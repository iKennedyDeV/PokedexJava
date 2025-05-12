package com.api.pokedex;

public class Pokemon {
    private Long id;
    private String name;
    private String imageUrl;
    private Types types;

    public Pokemon(Long id,String name,String imageUrl,Types types){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.types = types;

    }
    public Pokemon(){}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getImageUrl() {return imageUrl;}

    public void setImagemUrl(String imageUrl) {this.imageUrl = imageUrl;}

    public Types getTypes() {return types;}

    public void setTypes(Types types) {this.types = types;}

    @Override
    public String toString(){
        return "Name:"+ this.name +" type: "+this.types;
    }
}
