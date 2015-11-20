/**
 * Created by David on 2015-11-20.
 */
package com.example.owner.ibuy;
public class ItemModel {
    String title;
    String group;
    String buyer;
    boolean value; //True means checked and False means unchecked

    ItemModel(String s, String g, String b, boolean v){
        title=s;
        group=g;
        buyer=b;
        value = v;
    }
    //for a real multi-user application we would not use public methods except where necessary
    public String getTitle(){
        return title;
    }

    public String getGroup(){
        return group;
    }

    public String getBuyer(){
        return buyer;
    }

    public boolean getValue(){
        return value;
    }

    //Setter methods. Would not be public for a real application. Just for our test.
    public void setTitle(String n){
        title=n;
    }

    public void setGroup(String g){
        group=g;
    }

    public void setBuyer(String b){
        buyer=b;
    }

    public void setValue(boolean v){
        value=v;
    }
}
