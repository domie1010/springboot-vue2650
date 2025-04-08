const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm72axv/",
            name: "ssm72axv",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm72axv/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生社团管理系统"
        } 
    }
}
export default base
