import { useNavigation } from '@react-navigation/native';
import { StackNavigationProp } from '@react-navigation/stack';
import React, { useEffect, useState } from 'react';
import { View, Text, TouchableOpacity } from 'react-native';
import { MeetingType } from '../pages/Meetings';
import Routes, { stackParam } from '../routes';
import { text, theme } from '../styles';
import { DateDay, DateMonth } from './DateType';

type navigationScreenProps = StackNavigationProp<stackParam>;

export type DetailsType = {
    route: {params: {id: number}};
}

const MeetingCard: React.FC<MeetingType> = ({ id, title, date, sessions, presidency }) => {

    const [subSession, setSubSession] = useState("");

    const navigation = useNavigation<navigationScreenProps>();

    useEffect(() => {
        sessions.map(session => {
            if (session.id == 1) {
                session.subsessions.map(sub => {
                    sub.designations.map(desig => {
                        if (desig.assignment == "Discurso") {
                            setSubSession(sub.subsession)
                        }
                    })
                })
            }
        })
    }, [])

    return (
        <View style={theme.card}>
            <TouchableOpacity style={theme.meetingsContainer} activeOpacity={0.8}
                onPress={() => navigation.navigate("MeetingDetails", { id })}>
                <View style={theme.MeetingTitle}>
                    <View style={theme.TextMeetingTitle}>
                        <Text style={text.infoType}>
                            {title}
                        </Text>
                        <Text style={text.supportPerson}>
                            {DateDay(date)} de {DateMonth(date)}
                        </Text>
                    </View>

                    <Text style={text.themeMeeting}>
                        {subSession}
                    </Text>
                </View>

                <Text style={text.presidencyMeeting}>
                    Presidente: {presidency.designation.person}
                </Text>

            </TouchableOpacity>

        </View>
    )
}

export default MeetingCard;