class APIUtils
{
    constructor(apiContext)
    {
        this.apiContext = apiContext;
        //this.loginPayload = loginPayload;
    }
    async getBoards()
    {
        const endpoint ='https://api.trello.com/1/members/me/boards?key=446cbc1d6532c596ddc610207ead5576&token=da4438c7babc0245ac9d420b4c8f6905758560d946cf1e142989a854bc8d92f9';//'https://api.trello.com/1/tokens/da4438c7babc0245ac9d420b4c8f6905758560d946cf1e142989a854bc8d92f9?key=446cbc1d6532c596ddc610207ead5576&token=da4438c7babc0245ac9d420b4c8f6905758560d946cf1e142989a854bc8d92f9'';
        const resp = await this.apiContext.get(endpoint);
       // expect(resp.ok()).toBeTruthy();
        
        const jsonRsponse = await resp.json();
        console.log(jsonRsponse);
    }
}

module.exports = {APIUtils}; // to be globally visible