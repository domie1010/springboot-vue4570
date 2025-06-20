const base = {
    get() {
        return {
            url : "http://localhost:8080/qiyeneixinxihauxitong/",
            name: "qiyeneixinxihauxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/qiyeneixinxihauxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "企业内管信息化系统"
        } 
    }
}
export default base
