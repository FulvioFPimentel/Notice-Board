import { ThemeProvider } from '@react-navigation/native';
import React from 'react';
import { theme, text } from '../styles'
import { View, Text } from 'react-native'

export interface NoticeProps {
    id: Number,
    date: String,
    title: String,
    news: String,
}

const NoticeCard: React.FC<NoticeProps> = ({id, date, title, news}) => {
    return (
        <View style={theme.noticeContainer}>

            <Text style={text.noticeDate}>
                {date}
            </Text>

            <Text style={text.noticeTitle}>
                {title}
            </Text>
            <Text style={text.noticeNews}>
                {news}
            </Text>
        </View>
    )
}

export default NoticeCard;