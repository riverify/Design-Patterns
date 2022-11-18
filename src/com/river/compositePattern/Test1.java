package com.river.compositePattern;

/**
 * @author River
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建一个组织机构，这个组织机构是根节点
        Institution beiJingHeadQuarter, huNanSubSchool, changShaTeachingPost, xiangTanTeachingPost;
        // 创建办公室
        Office teachingOffice1, teachingOffice2, teachingOffice3, teachingOffice4;
        Office administrationOffice1, administrationOffice2, administrationOffice3, administrationOffice4;


        // 根据书中树状图所示，建立组织结构

        // 实例化组织机构
        beiJingHeadQuarter = new Institution("总部北京");
        huNanSubSchool = new Institution("湖南分校");
        changShaTeachingPost = new Institution("长沙教学点");
        xiangTanTeachingPost = new Institution("湘潭教学点");

        // 实例化办公室
        teachingOffice1 = new Office("北京教务办公室");
        teachingOffice2 = new Office("湖南教务办公室");
        teachingOffice3 = new Office("长沙教务办公室");
        teachingOffice4 = new Office("湘潭教务办公室");

        administrationOffice1 = new Office("北京行政办公室");
        administrationOffice2 = new Office("湖南行政办公室");
        administrationOffice3 = new Office("长沙行政办公室");
        administrationOffice4 = new Office("湘潭行政办公室");

        // 形成组织架构——先将各层节点添加到根节点下
        changShaTeachingPost.add(teachingOffice3);
        changShaTeachingPost.add(administrationOffice3);
        xiangTanTeachingPost.add(teachingOffice4);
        xiangTanTeachingPost.add(administrationOffice4);

        huNanSubSchool.add(teachingOffice2);
        huNanSubSchool.add(administrationOffice2);
        huNanSubSchool.add(changShaTeachingPost);
        huNanSubSchool.add(xiangTanTeachingPost);


        beiJingHeadQuarter.add(teachingOffice1);
        beiJingHeadQuarter.add(administrationOffice1);
        beiJingHeadQuarter.add(huNanSubSchool);


        // 调用根节点handleArchives()方法
        beiJingHeadQuarter.handleArchives();

    }
}
