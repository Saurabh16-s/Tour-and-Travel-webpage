import axios from "axios";

const API = axios.create({
  baseURL: "http://13.127.212.231:8080"
});

// ⭐ attach token automatically
API.interceptors.request.use((config) => {
  const token = localStorage.getItem("token");
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});

export default API;