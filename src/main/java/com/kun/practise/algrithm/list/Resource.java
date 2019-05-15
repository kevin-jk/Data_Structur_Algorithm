package com.kun.practise.algrithm.list;

/**
 * @Author: jrjiakun
 * @Date: 2019/2/3 15:09
 */
public class Resource {
    private String resourceName;

    /**
     *  假设这个资源需要开线程去获取
     * */
    private byte[] resouceByte;

    public Resource(){
        resourceName = "Test resouce";
       Thread t =  new Thread(()->{
            try{
                Thread.sleep(5000L);
                resouceByte = new byte[1000];
            }catch (Exception e){
            }
        });
       t.start();
        try{
            t.join();
        }catch (Exception e){

        }
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public byte[] getResouceByte() {
        return resouceByte;
    }

    public void setResouceByte(byte[] resouceByte) {
        this.resouceByte = resouceByte;
    }
}
