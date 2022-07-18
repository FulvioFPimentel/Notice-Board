import react from 'react';
import { useNavigation } from '@react-navigation/native'
import { View, Text, TouchableOpacity, ScrollView } from 'react-native';
import { StackNavigationProp } from '@react-navigation/stack';

import { colors, text, theme } from '../styles';
import { MeetingCard } from '../components';

type navigateParam = {
    Notice: undefined;
}

type StackProp = StackNavigationProp<navigateParam>;

const Meetings: React.FC = () => {

    const navigation = useNavigation<StackProp>();

    const meetings = [
        {
            id: 1,
            title: "1 SAMUEL 23-24",
            subsession: "Como voce quer ser conhecido?",
            date: "2022-01-30T19:30:00Z",
            presidency: "Leandro Brito"
        },
        {
            id: 2,
            title: "Discurso Publico",
            subsession: "Demonstre Amor",
            date: "2022-02-05T19:30:00Z",
            presidency: "Messias Pimentel"
        },

    ];


    return (
        <ScrollView style={theme.container}>
    
            {meetings.map((meeting) => (
                <Text>
                    <MeetingCard { ...meeting}/>
                </Text>
                
            ))}
   
        </ScrollView>
    );
}

export default Meetings;