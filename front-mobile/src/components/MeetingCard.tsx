import React from 'react';
import { View, Text } from 'react-native';
import { theme } from '../styles';

export interface MeetingProps {
    id: number,
    title: string,
    subsession: string,
    date: string,
    presidency: string,
}

const MeetingCard: React.FC<MeetingProps> = ({id, title, subsession, date, presidency}) => {
    
    return (
        <View style={theme.meetingsContainer}>
            <View>
                <Text>
                    {title}
                    {date}
                </Text>
                <Text>
                    {subsession}
                </Text>
            </View>
           <Text>
            {presidency}
           </Text>
        </View>
    )
}

export default MeetingCard;