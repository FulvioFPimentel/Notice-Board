import { ThemeProvider } from '@react-navigation/native';
import React from 'react';
import { theme, text } from '../styles'
import { View, Text } from 'react-native'
import { DateDay, DateMonth, DateYear } from './DateType';

export interface NoticeProps {
    id: number,
    date: string,
    title: string,
    news: string,
}

const NoticeCard: React.FC<NoticeProps> = ({id, date, title, news}) => {


    return (
        <View style={theme.noticeContainer}>

            <Text style={text.noticeDate}>
                {DateDay(date)}/{DateMonth(date)}/{DateYear(date)}
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