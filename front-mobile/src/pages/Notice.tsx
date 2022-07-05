import axios from "axios";
import React, { useEffect, useState } from  "react";
import { View, Text, ScrollView, ActivityIndicator } from "react-native";
import { NoticeCard } from '../components/index';
import { NoticeProps } from "../components/NoticeCard";
import  { api } from "../services";

const Notice: React.FC = () => {

const [ notices, setNotices  ] = useState([]);
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
       <ScrollView>


        { loading ? (
            <ActivityIndicator size="large" />
          ) :
            notices.map((notice) => (
                <NoticeCard { ...notice as NoticeProps} />
       ))}
        </ScrollView>
    );
}

export default Notice;