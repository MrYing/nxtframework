(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-4c0fe15c"],{"77cb":function(a,e,t){},"80b5":function(a,e,t){"use strict";t.r(e);var r=function(){var a=this,e=a.$createElement,t=a._self._c||e;return t("div",{staticClass:"app-container"},[t("el-card",{staticClass:"operatingHints"},[t("el-row",{staticStyle:{"font-weight":"800"}},[a._v("\n      操作提示：\n    ")]),a._v(" "),a._l(a.headerList,(function(e){return t("el-row",{key:e.content},[a._v("\n      "+a._s(e.content)+"\n    ")])}))],2),a._v(" "),t("el-card",{staticClass:"operatingHints"},[t("el-row",{staticStyle:{"margin-top":"10px"}},[t("el-col",{attrs:{offset:16}},[t("el-select",{attrs:{placeholder:"状态",clearable:""},model:{value:a.searchBean.status,callback:function(e){a.$set(a.searchBean,"status",e)},expression:"searchBean.status"}},a._l(a.isList,(function(a){return t("el-option",{key:a.value,attrs:{label:a.label,value:a.value}})})),1),a._v(" "),t("el-input",{staticStyle:{width:"150px"},attrs:{placeholder:"用户名"},model:{value:a.searchBean.username,callback:function(e){a.$set(a.searchBean,"username",e)},expression:"searchBean.username"}}),a._v(" "),t("el-button",{attrs:{type:"primary"},on:{click:a.searchAction}},[a._v("筛选")])],1)],1),a._v(" "),t("el-row",{staticStyle:{"margin-top":"10px"}},[t("el-table",{ref:"multipleTable",attrs:{data:a.listData,"tooltip-effect":"dark"}},[t("el-table-column",{attrs:{prop:"username",label:"用户名",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"platformPerson",label:"真实姓名",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"",label:"收款平台账号",width:"220px;"},scopedSlots:a._u([{key:"default",fn:function(e){return[t("div",{staticStyle:{"text-align":"left","text-overflow":"ellipsis",overflow:"hidden"}},[a._v(a._s(e.row.platformAccount))])]}}])}),a._v(" "),t("el-table-column",{attrs:{prop:"platform",label:"收款平台名称",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"platformText",label:"收款平台类型",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"datelineCreateReadable",label:"申请时间",width:"180px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"amount",label:"金额",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"statusText",label:"审核结果",width:"120px"}}),a._v(" "),t("el-table-column",{attrs:{prop:"",label:"操作","show-overflow-tooltip":"","header-align":"left"},scopedSlots:a._u([{key:"default",fn:function(e){return[t("router-link",{attrs:{to:{path:"/transaction/transactionList",query:{username:e.row.username}},target:"_blank"}},[t("el-button",{attrs:{type:"text",size:"small"}},[a._v("查看资金记录")])],1),a._v(" "),t("el-button",{attrs:{type:"text",size:"small"},on:{click:function(t){return a.withdrawApprovalShow(e.row)}}},[a._v("审核")]),a._v(" "),t("el-button",{attrs:{type:"text",size:"small"},on:{click:function(t){return a.transferUpdateShow(e.row)}}},[a._v("填写汇款结果")])]}}])})],1)],1),a._v(" "),t("el-row",{staticStyle:{"margin-top":"20px"}},[t("el-col",{attrs:{offset:18}},[t("el-button",{attrs:{type:"primary",icon:"el-icon-arrow-left"},on:{click:function(e){return a.handlePage(-1)}}},[a._v("上一页")]),a._v(" "),t("el-button",[a._v(a._s(a.searchBean.listNumber)+" / "+a._s(a.pageCount))]),a._v(" "),t("el-button",{attrs:{type:"primary",icon:"el-icon-arrow-right"},on:{click:function(e){return a.handlePage(1)}}},[a._v("下一页")])],1)],1)],1),a._v(" "),t("el-dialog",{attrs:{title:"审核",visible:a.approvalDialog,"close-on-click-modal":!1,"show-close":!1,"close-on-press-escape":!1,width:"500px",center:""},on:{"update:visible":function(e){a.approvalDialog=e}}},[t("el-form",{ref:"approvalRef",attrs:{model:a.approvalParam,rules:a.approvalParamRules,"label-width":"140px"}},[t("el-form-item",{attrs:{label:"用户名",prop:"username"}},[t("span",[a._v(a._s(a.approvalParam.username))])]),a._v(" "),t("el-form-item",{attrs:{label:"提现金额",prop:"username"}},[t("span",[a._v(a._s(a.approvalParam.amount))])]),a._v(" "),t("el-form-item",{attrs:{label:"提现备注",prop:"inviterUsername"}},[t("el-input",{staticStyle:{width:"200px"},attrs:{type:"textarea",disabled:""},model:{value:a.approvalParam.remarkUser,callback:function(e){a.$set(a.approvalParam,"remarkUser",e)},expression:"approvalParam.remarkUser"}})],1),a._v(" "),t("el-form-item",{attrs:{label:"审核意见",prop:"approval"}},[t("el-radio-group",{model:{value:a.approvalParam.approval,callback:function(e){a.$set(a.approvalParam,"approval",e)},expression:"approvalParam.approval"}},[t("el-radio",{attrs:{label:!0}},[a._v("批准")]),a._v(" "),t("el-radio",{attrs:{label:!1}},[a._v("拒绝")])],1)],1)],1),a._v(" "),t("div",{staticStyle:{"text-align":"center"}},[t("el-button",{attrs:{type:"primary"},on:{click:a.saveApproval}},[a._v("确定")]),a._v(" "),t("el-button",{on:{click:function(e){a.approvalDialog=!1}}},[a._v("取 消")])],1)],1),a._v(" "),t("el-dialog",{attrs:{title:"汇款结果",visible:a.transferDialog,"close-on-click-modal":!1,"show-close":!1,"close-on-press-escape":!1,width:"500px",center:""},on:{"update:visible":function(e){a.transferDialog=e}}},[t("el-form",{ref:"transferRef",attrs:{model:a.transferParam,rules:a.transferParamRules,"label-width":"140px"}},[t("el-form-item",{attrs:{label:"用户名",prop:"username"}},[t("span",[a._v(a._s(a.transferParam.username))])]),a._v(" "),t("el-form-item",{attrs:{label:"提现金额",prop:"amount"}},[t("span",[a._v(a._s(a.transferParam.amount))])]),a._v(" "),t("el-form-item",{attrs:{label:"提现备注",prop:"remarkUser"}},[t("el-input",{staticStyle:{width:"200px"},attrs:{type:"textarea",disabled:""},model:{value:a.transferParam.remarkUser,callback:function(e){a.$set(a.transferParam,"remarkUser",e)},expression:"transferParam.remarkUser"}})],1),a._v(" "),t("el-form-item",{attrs:{label:"汇款单号",prop:"serialNum"}},[t("el-input",{staticStyle:{width:"200px"},model:{value:a.transferParam.serialNum,callback:function(e){a.$set(a.transferParam,"serialNum",e)},expression:"transferParam.serialNum"}})],1),a._v(" "),t("el-form-item",{attrs:{label:"备注",prop:"remark"}},[t("el-input",{staticStyle:{width:"200px"},attrs:{type:"textarea"},model:{value:a.transferParam.remark,callback:function(e){a.$set(a.transferParam,"remark",e)},expression:"transferParam.remark"}})],1)],1),a._v(" "),t("div",{staticStyle:{"text-align":"center"}},[t("el-button",{attrs:{type:"primary"},on:{click:a.saveTransfer}},[a._v("确定")]),a._v(" "),t("el-button",{on:{click:function(e){a.transferDialog=!1}}},[a._v("取 消")])],1)],1)],1)},s=[],l={data:function(){var a=function(a,e,t){null==e||0===e.length?t(new Error("汇款单号不能为空")):t()},e=function(a,e,t){null==e||0===e.length?t(new Error("备注不能为空")):t()};return{headerList:[{content:"1、用户提交申请时，申请金额会被暂时冻结，用户取消申请或者管理员拒绝申请时解冻。"},{content:"2、在这里审核通过的提现申请会转入“汇款管理”—“待汇款列表”。"},{content:"3、银行信息和支付宝账号，用户只要二选一填写即满足要求。"},{content:"4、对于审核通过的用户提现申请，可以通过人工给用户汇款。"},{content:"5、汇款结果的单号，提在这里以供用户查看和对证。"},{content:"6、填写汇款结果，状态修改成“汇款成功”后，提现金额和手续费即从系统余额中正式扣除，该步骤不可撤销。"},{content:"7、填写汇款结果，状态修改成“汇款失败”后，提现金额和手续费解除冻结，回到用户余额中；用户可以重新提交提现申请，该步骤不可撤销。"}],searchBean:{offset:0,limit:10,listNumber:1},isList:[{value:0,label:"已申请"},{value:1,label:"已批准"},{value:2,label:"已拒绝"},{value:3,label:"已汇款"}],listData:[],pageCount:0,approvalDialog:!1,approvalParam:{},approvalParamRules:{},transferDialog:!1,transferParam:{},transferParamRules:{serialNum:[{required:!0,trigger:"blur",validator:a}],remark:[{required:!0,trigger:"blur",validator:e}]}}},computed:{},created:function(){},mounted:function(){this.searchDate()},methods:{searchAction:function(){this.$set(this.searchBean,"offset",0),this.$set(this.searchBean,"listNumber",1),this.searchDate()},searchDate:function(){var a=this;this.$myLoading.myLoading.loading(),null!=this.searchBean.status&&""===this.searchBean.status&&(this.searchBean.status=null),null!=this.searchBean.username&&""===this.searchBean.username&&(this.searchBean.username=null),this.$store.dispatch("withdraw/searchListData",this.searchBean).then((function(){a.listData=a.$store.state.withdraw.listData,a.pageCount=Math.ceil(a.$store.state.withdraw.countData/a.searchBean.limit);var e=a;e.$myLoading.myLoading.closeLoading()}))},handlePage:function(a){if(this.searchBean.listNumber+a<1||this.searchBean.listNumber+a>this.pageCount)return!1;this.searchBean.listNumber=this.searchBean.listNumber+a,this.searchBean.offset=(this.searchBean.listNumber-1)*this.searchBean.limit,this.searchDate()},withdrawApprovalShow:function(a){this.approvalParam=Object.assign({},a),this.$set(this.approvalParam,"approval",!0),this.approvalDialog=!0},saveApproval:function(){var a=this;this.$store.dispatch("withdraw/withdrawApproval",this.approvalParam).then((function(){var e=a.$store.state.withdraw.withdrawApprovalStatus;null!=e&&0===e?(a.$message({type:"success",message:"审核成功"}),a.approvalDialog=!1,setTimeout((function(){a.searchDate()}),1e3)):a.$message({type:"error",message:"审核失败"})}))},transferUpdateShow:function(a){this.transferParam=Object.assign({},a),this.transferDialog=!0},saveTransfer:function(){var a=this;this.$refs.transferRef.validate((function(e){e&&a.$store.dispatch("withdraw/transferUpdate",a.transferParam).then((function(){var e=a.$store.state.withdraw.transferUpdateStatus;null!=e&&0===e?(a.$message({type:"success",message:"操作成功"}),a.searchDate(),a.transferDialog=!1):a.$message({type:"error",message:"操作失败"})}))}))}}},n=l,o=(t("cc67"),t("2877")),i=Object(o["a"])(n,r,s,!1,null,null,null);e["default"]=i.exports},cc67:function(a,e,t){"use strict";t("77cb")}}]);