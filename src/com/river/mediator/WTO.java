package com.river.mediator;

/**
 * FileName: WTO
 * Date: 2022/12/01
 * Time: 14:28
 * Author: river
 * <p>
 * 具体中介类 - WTO
 * <p>
 * WTO作为一个中介者，需要持有所有的国家成员对象，以便在需要的时候进行消息的发送。
 * 这也便是中介者模式的缺点--需要持有所有的具体国家类的对象，这样会导致中介者对象非常庞大。
 */
public class WTO extends UnitedNations {

    /**
     * 美国
     */
    private USA america;

    /**
     * 中国
     */
    private PRC china;

    /**
     * 日本
     */
    private JP japan;


    /**
     * 美国对象的setter方法
     *
     * @param america 美国对象
     */
    public void setUSA(USA america) {
        this.america = america;
    }

    /**
     * 中国对象的setter方法
     *
     * @param china 中国对象
     */
    public void setPCR(PRC china) {
        this.china = china;
    }

    /**
     * 日本对象的setter方法
     *
     * @param japan 日本对象
     */
    public void setJP(JP japan) {
        this.japan = japan;
    }


    /**
     * 声明一个联合国成员方法。
     * 本方法目前是中美之间的消息发送方法,每个if判断 为一个单向消息发送。
     * 当美国对象调用declare(String message)时候，即america.declare("xxx")，在那个方法体内会调用本方法 --
     * wto.declare("xxx", america)，此america是消息的发送国，我们本方法下面方法体内会将消息发送给china(china.getDeclare("xxx"))。
     * <p/>
     * 在每一个if体中，消息的发送者和接收者分别在if的判断条件中和下面对getDeclare调用中。
     * 若想要增加一个国家和国家的单项通讯，如日本对中国的单项通讯，则需要在WTO类中增加一个日本对象，然后在本方法中增加一个判断，如果是日本对象，
     * 则调用中国对象的getDeclare方法。<p/>
     * 由于是仅仅用于学习中介者模式，本方法存在缺点：一个国家不能实现多个国家的单项通讯，如中国对美国通讯了，中国就不能再对日本通讯了。
     *
     * @param message 需要发送的消息
     * @param country 发送消息的国家
     */
    @Override
    public void declare(String message, Country country) {
        if (country == america) {
            china.getDeclare(message);
        } else if (country == china) {
            america.getDeclare(message);
//            japan.getDeclare(message);　一个国家不能实现多个国家的单项通讯，如中国对美国通讯了，中国就不能再对日本通讯了。
        } else if (country == japan) {
            china.getDeclare(message);
        }
    }
}
