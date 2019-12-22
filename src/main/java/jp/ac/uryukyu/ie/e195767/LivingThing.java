package jp.ac.uryukyu.ie.e195767;

/**
 * Heroクラス、Enemyクラスの共通部分をまとめたクラス。
 */
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

    /**
     * コンストラクタ。名前、最大HP、攻撃力を継承させる
     * @param name ヒーロー、または敵の名前。
     * @param maximumHP　ヒーロー、または敵の最大HP
     * @param attack　ヒーロー、または敵の攻撃力
     */
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

    public String getName(){                     //nameのgetter
        return name;
    }

    public void setName(String name){            //nameのsetter
        this.name = name;
    }

    /**
     * 攻撃するメソッド。
     * 相手のHPが0でないなら攻撃する。
     * @param opponent 敵の情報
     */
    public void attack(LivingThing opponent){

        if(this.dead==false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }

    /**
     * ダメージ計算のメソッド。
     * HPが0以下になったら死んでいるとみなす。
     * @param damage ダメージ量
     */
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
