<template>
  <div>
    <div>账号切换</div>
    <button @click="zhangsan()" type="default" size="mini">张三</button>
    <button @click="lisi()" type="default" size="mini">李四</button>
    <button @click="zzjl()" type="default" size="mini">张总经理</button>
    <button @click="admin()" type="default" size="mini">admin</button>
    <div>当前token:{{ token }}</div>
  </div>
</template>

<script>
export default {
  name: "Test",

  data() {
    return {
      token: ''
    };
  },

  created(){
    this.token = window.localStorage.getItem('token')
  },

  methods: {
    admin() {
      window.localStorage.setItem('token', '');
      let token = 'eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJScgwN8dANDXYNUtJRSq0oULIyNLMwNTS3MDQx1FEqLU4t8kwBikGYeYm5qUAtiSm5mXlKtQDpHz5qQgAAAA.Okkw2A2fjuKhmyUGyq0vEXeDiG6__8TbgJmT9msSybStWHAxvHHIlyrBJqfvuQ923OSAjV971q5DpmEfbeidEA'
      window.localStorage.setItem('token', token);
      this.token = window.localStorage.getItem('token')
    },

    zhangsan() {
      window.localStorage.setItem('token', '');
      let token = 'eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJScgwN8dANDXYNUtJRSq0oULIyNLMwNTS3MDGx0FEqLU4t8kxRsjKHMPMSc1OBWqoyEvPSjZVqATsVtDRDAAAA.plPw8DExkLByYDv2amdb0HCFLHieiLXnE-RABP7ctfRcntQOf4hFRnNok5zPK6VcffstutleZNMbpy_0Iza0zQ'
      window.localStorage.setItem('token', token);
      this.token = window.localStorage.getItem('token')
    },

    zzjl() {
      window.localStorage.setItem('token', '');
      let token = 'eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJScgwN8dANDXYNUtJRSq0oULIyNDM3NjMwNLYw11EqLU4t8kxRsjKFMPMSc1OBWqqqsnKUagGHebUNQQAAAA.FcCkD6QfaP8bd_3MYsRD6Tp9wr9JSRFWIUuIdG5O7XxhIeyWfzGLp40_Lesx_kWMMaaskh_ba3NrTlj8-nP6OA'
      window.localStorage.setItem('token', token);
      this.token = window.localStorage.getItem('token')
    },

    lisi() {
      window.localStorage.setItem('token', '');
      let token = 'eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJScgwN8dANDXYNUtJRSq0oULIyNLMwNTS3MDWw1FEqLU4t8kxRsjKBMPMSc1OBWnIyTZRqAUYDWlZAAAAA.en6KLfpfwS5YNyG-R7Zf-7qqCLgxZsWO6Kmc7a7R7jsgQ7y0FSJsaMej17g9qbekMbeHZgH5datks1_aEjYe4w'
      window.localStorage.setItem('token', token);
      this.token = window.localStorage.getItem('token')
    }
  }
}
</script>
