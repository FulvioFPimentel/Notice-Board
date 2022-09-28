import axios from "axios";
import React, { useEffect, useState } from  "react";
import { View, Text, ScrollView, ActivityIndicator } from "react-native";
import { NoticeCard } from '../components/index';
import { NoticeProps } from "../components/NoticeCard";
import  { api } from "../services";
import { theme } from "../styles";

const Notice: React.FC = () => {

const [ notices, setNotices  ] = useState<NoticeProps[]>([]);
const [ loading, setLoading ] = useState(false);

async function fillNotices() {
    setLoading(true);
    const res = await api.get(`/news?direction=ASC`)
  setNotices(res.data.content);
  setLoading(false);
 
}

useEffect(() => {
    fillNotices();
},[])
    return (
       <ScrollView style={theme.container}>

        { loading ? (
            <ActivityIndicator size="large" color="#9E9E9E" />
          ) :
            notices.map((notice) => (
              <NoticeCard { ...notice}
                key={notice.id}
              />
       ))}
        </ScrollView>
    );
}

export default Notice;