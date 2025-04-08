
var projectName = '大学生社团管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '社团信息',
	url: './pages/shetuanxinxi/list.html'
}, 
{
	name: '社团加入信息',
	url: './pages/shetuanjiaruxinxi/list.html'
}, 
{
	name: '活动信息',
	url: './pages/huodongxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm72axv/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社长","menuJump":"列表","tableName":"shezhang"}],"menu":"社长管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团分类","menuJump":"列表","tableName":"shetuanfenlei"}],"menu":"社团分类管理"},{"child":[{"buttons":["查看","删除"],"menu":"社团加入信息","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"社团成员登记","menuJump":"列表","tableName":"shetuanchengyuandengji"}],"menu":"社团成员登记管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","申请加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团加入信息列表","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息模块"},{"child":[{"buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论","申请加入"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["查看"],"menu":"社团加入信息","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息管理"},{"child":[{"buttons":["查看"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","申请加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团加入信息列表","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息模块"},{"child":[{"buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论","发布活动"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["查看","成员登记","审核","删除"],"menu":"社团加入信息","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团成员登记","menuJump":"列表","tableName":"shetuanchengyuandengji"}],"menu":"社团成员登记管理"},{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","申请加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看"],"menu":"社团加入信息列表","menuJump":"列表","tableName":"shetuanjiaruxinxi"}],"menu":"社团加入信息模块"},{"child":[{"buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"社长","tableName":"shezhang"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
