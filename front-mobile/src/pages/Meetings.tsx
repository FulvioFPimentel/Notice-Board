import react, { useEffect, useState } from 'react';
import { useNavigation } from '@react-navigation/native'
import { View, Text, TouchableOpacity, ScrollView } from 'react-native';
import { StackNavigationProp } from '@react-navigation/stack';

import { colors, text, theme } from '../styles';
import { MeetingCard } from '../components';
import { api } from '../services';

export type MeetingType = {
    id: number;
    title: string;
    date: string;
    sessions:SessionType[];
    presidency: PresidencyType;
    canticles: CanticlesType[];
    prayers: PrayersType[];
}

export type CanticlesType = {
    id: number;
    number: number;
    title: string;
}

export type PrayersType = {
    id: number;
    moment: string;
    designation: DesignationsType;
}

export type PresidencyType = {
    designation: PersonType;
}

export type PersonType = {
    person: string;
}

export type SessionType = {
    id: number;
    session: string;
    subsessions: SubSessionType[];
}

export type SubSessionType = {
    id: number;
    subsession: string;
    designations: DesignationsType[];
}

export type DesignationsType = {
    id: number;
    assignment: string;
    person: string;
}

type navigateParam = {
    Notice: undefined;
}

type StackProp = StackNavigationProp<navigateParam>;

const Meetings: React.FC = () => {

    const navigation = useNavigation<StackProp>();

    const [ meeting, setMeeting ] = useState<MeetingType[]>([]);


    async function fillMeeting(){
        const res = await api.get(`/meetings/page?direction=ASC&orderBy=date`)
        setMeeting(res.data.content)
    }

     useEffect(() => {
        fillMeeting();
     }, [])

    return (
        <ScrollView style={theme.container}>
    
            {meeting.map((meetings) => (
                <Text>
                    <MeetingCard { ...meetings}
                    key={meetings.id}
                    />
                </Text>
                
            ))}
   
        </ScrollView>
    );
}

export default Meetings;