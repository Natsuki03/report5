package jp.ac.uryukyu.ie.e195767;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public int getHitPoint(){                 //hitpointのgetter
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){   //hitpointのsetter
        this.hitPoint = hitPoint;
    }

    public int getAttack(){                  //attackのgetter
        return attack;
    }

    public void setAttack(int attack){      //attackのsetter
        this.attack = attack;
    }

    public void setDead(boolean dead){    //deadのsetter
        this.dead = dead;
    }

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }      //nameのgetter

    public void setName(String name){            //nameのsetter
        this.name = name;
    }

    public void attack(LivingThing opponent){

        if(this.dead==false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    public void cal_damage(int damame){
        hitPoint -= damame;
    }
}
