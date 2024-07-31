import axios from "axios";

const http = axios.create({
    baseURL: import.meta.env.VITE_REMOTE_API
});

export default{
    getTopics(){
        return http.get('/topics');
    },
    getTopic(topicsId){
        return http.get(`/topics/${topicsId}`);
    },
    getMessage(messageId){
        return http.get(`/topics/${messageId}`);
    }
}